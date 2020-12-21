/*
 * Copyright (C) 2012-13 MINHAP, Gobierno de España This program is licensed and may be used,
 * modified and redistributed under the terms of the European Public License (EUPL), either version
 * 1.1 or (at your option) any later version as soon as they are approved by the European
 * Commission. Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * more details. You should have received a copy of the EUPL1.1 license along with this program; if
 * not, you may find it at http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 */

/**
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package es.mpt.dsic.inside.security.interceptor;

import org.apache.cxf.binding.soap.SoapFault;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class SoapAuthenticationInterceptor extends AbstractPhaseInterceptor<SoapMessage>
    implements InitializingBean {

  private AuthenticationManager authenticationManager;
  private boolean authenticationRequired = true;

  public SoapAuthenticationInterceptor() {
    super(Phase.RECEIVE);
  }

  public void setAuthenticationManager(AuthenticationManager authenticationManager) {
    this.authenticationManager = authenticationManager;
  }

  public void setAuthenticationRequired(boolean authenticationRequired) {
    this.authenticationRequired = authenticationRequired;
  }

  public void afterPropertiesSet() throws Exception {
    if (authenticationManager == null) {
      throw new IllegalStateException("No authentication manager has been configured");
    }
  }

  public void handleMessage(SoapMessage message) throws Fault {
    Authentication authentication = message.getExchange().get(Authentication.class);
    if (authentication != null) {
      try {
        authentication = authenticationManager.authenticate(authentication);
        message.getExchange().put(Authentication.class, authentication);
      } catch (AuthenticationException ex) {
        throw new SoapFault("Bad credentials", message.getVersion().getSender());
      }
    } else if (authenticationRequired) {
      throw new SoapFault("Authentication required", message.getVersion().getSender());
    }
  }
}
