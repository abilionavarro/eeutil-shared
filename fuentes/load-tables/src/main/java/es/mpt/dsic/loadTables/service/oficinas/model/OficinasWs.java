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


package es.mpt.dsic.loadTables.service.oficinas.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Clase Java para OficinasWs complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OficinasWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="formatoFichero" type="{http://impl.manager.directorio.map.es/wsExport}formatoFichero"/>
 *         &lt;element name="tipoConsulta" type="{http://impl.manager.directorio.map.es/wsExport}tipoConsultaOF"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nivelAdministracion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="estados" type="{http://impl.manager.directorio.map.es/wsExport}excluidos" minOccurs="0"/>
 *         &lt;element name="comunidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicios" type="{http://impl.manager.directorio.map.es/wsExport}servicios" minOccurs="0"/>
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OficinasWs",
    propOrder = {"usuario", "clave", "formatoFichero", "tipoConsulta", "codigo",
        "nivelAdministracion", "estados", "comunidad", "provincia", "codigoUnidad", "servicios",
        "fechaInicio", "fechaFin"})
public class OficinasWs {

  @XmlElement(required = true)
  protected String usuario;
  @XmlElement(required = true)
  protected String clave;
  @XmlElement(required = true)
  protected FormatoFichero formatoFichero;
  @XmlElement(required = true)
  protected TipoConsultaOF tipoConsulta;
  protected String codigo;
  protected Integer nivelAdministracion;
  protected Excluidos estados;
  protected String comunidad;
  protected String provincia;
  protected String codigoUnidad;
  protected Servicios servicios;
  protected String fechaInicio;
  protected String fechaFin;

  /**
   * Obtiene el valor de la propiedad usuario.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getUsuario() {
    return usuario;
  }

  /**
   * Define el valor de la propiedad usuario.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setUsuario(String value) {
    this.usuario = value;
  }

  /**
   * Obtiene el valor de la propiedad clave.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getClave() {
    return clave;
  }

  /**
   * Define el valor de la propiedad clave.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setClave(String value) {
    this.clave = value;
  }

  /**
   * Obtiene el valor de la propiedad formatoFichero.
   * 
   * @return possible object is {@link FormatoFichero }
   * 
   */
  public FormatoFichero getFormatoFichero() {
    return formatoFichero;
  }

  /**
   * Define el valor de la propiedad formatoFichero.
   * 
   * @param value allowed object is {@link FormatoFichero }
   * 
   */
  public void setFormatoFichero(FormatoFichero value) {
    this.formatoFichero = value;
  }

  /**
   * Obtiene el valor de la propiedad tipoConsulta.
   * 
   * @return possible object is {@link TipoConsultaOF }
   * 
   */
  public TipoConsultaOF getTipoConsulta() {
    return tipoConsulta;
  }

  /**
   * Define el valor de la propiedad tipoConsulta.
   * 
   * @param value allowed object is {@link TipoConsultaOF }
   * 
   */
  public void setTipoConsulta(TipoConsultaOF value) {
    this.tipoConsulta = value;
  }

  /**
   * Obtiene el valor de la propiedad codigo.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodigo() {
    return codigo;
  }

  /**
   * Define el valor de la propiedad codigo.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodigo(String value) {
    this.codigo = value;
  }

  /**
   * Obtiene el valor de la propiedad nivelAdministracion.
   * 
   * @return possible object is {@link Integer }
   * 
   */
  public Integer getNivelAdministracion() {
    return nivelAdministracion;
  }

  /**
   * Define el valor de la propiedad nivelAdministracion.
   * 
   * @param value allowed object is {@link Integer }
   * 
   */
  public void setNivelAdministracion(Integer value) {
    this.nivelAdministracion = value;
  }

  /**
   * Obtiene el valor de la propiedad estados.
   * 
   * @return possible object is {@link Excluidos }
   * 
   */
  public Excluidos getEstados() {
    return estados;
  }

  /**
   * Define el valor de la propiedad estados.
   * 
   * @param value allowed object is {@link Excluidos }
   * 
   */
  public void setEstados(Excluidos value) {
    this.estados = value;
  }

  /**
   * Obtiene el valor de la propiedad comunidad.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getComunidad() {
    return comunidad;
  }

  /**
   * Define el valor de la propiedad comunidad.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setComunidad(String value) {
    this.comunidad = value;
  }

  /**
   * Obtiene el valor de la propiedad provincia.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getProvincia() {
    return provincia;
  }

  /**
   * Define el valor de la propiedad provincia.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setProvincia(String value) {
    this.provincia = value;
  }

  /**
   * Obtiene el valor de la propiedad codigoUnidad.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodigoUnidad() {
    return codigoUnidad;
  }

  /**
   * Define el valor de la propiedad codigoUnidad.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodigoUnidad(String value) {
    this.codigoUnidad = value;
  }

  /**
   * Obtiene el valor de la propiedad servicios.
   * 
   * @return possible object is {@link Servicios }
   * 
   */
  public Servicios getServicios() {
    return servicios;
  }

  /**
   * Define el valor de la propiedad servicios.
   * 
   * @param value allowed object is {@link Servicios }
   * 
   */
  public void setServicios(Servicios value) {
    this.servicios = value;
  }

  /**
   * Obtiene el valor de la propiedad fechaInicio.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFechaInicio() {
    return fechaInicio;
  }

  /**
   * Define el valor de la propiedad fechaInicio.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setFechaInicio(String value) {
    this.fechaInicio = value;
  }

  /**
   * Obtiene el valor de la propiedad fechaFin.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFechaFin() {
    return fechaFin;
  }

  /**
   * Define el valor de la propiedad fechaFin.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setFechaFin(String value) {
    this.fechaFin = value;
  }

}
