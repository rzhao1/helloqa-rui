

/* First created by JCasGen Wed Jul 13 13:34:46 SGT 2011 */
package org.oaqa.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Jul 13 13:34:46 SGT 2011
 * XML source: C:/Users/Junyang Ng/Desktop/dso/OAQA/descriptors/OAQATypes.xml
 * @generated */
public class ICEvent extends OAQAAnnotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(ICEvent.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected ICEvent() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ICEvent(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ICEvent(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ICEvent(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: label

  /** getter for label - gets 
   * @generated */
  public String getLabel() {
    if (ICEvent_Type.featOkTst && ((ICEvent_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.oaqa.model.ICEvent");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ICEvent_Type)jcasType).casFeatCode_label);}
    
  /** setter for label - sets  
   * @generated */
  public void setLabel(String v) {
    if (ICEvent_Type.featOkTst && ((ICEvent_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.oaqa.model.ICEvent");
    jcasType.ll_cas.ll_setStringValue(addr, ((ICEvent_Type)jcasType).casFeatCode_label, v);}    
  }

    