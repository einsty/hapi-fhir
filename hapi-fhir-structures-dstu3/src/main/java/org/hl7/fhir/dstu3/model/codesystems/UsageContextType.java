package org.hl7.fhir.dstu3.model.codesystems;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Tue, Dec 6, 2016 09:42-0500 for FHIR v1.8.0


import org.hl7.fhir.exceptions.FHIRException;

public enum UsageContextType {

        /**
         * The gender of the patient. For this context type, the value should be a code taken from the [AdministrativeGender](valueset-administrative-gender.html) value set
         */
        GENDER, 
        /**
         * The age of the patient. For this context type, the value should be a range the specifies the applicable ages or a code from the MeSH value set AgeGroupObservationValue
         */
        AGE, 
        /**
         * The clinical concept(s) addressed by the artifact. For example, disease, diagnostic test interpretation, medication ordering.
         */
        FOCUS, 
        /**
         * The clinical speciality of the context in which the patient is bring treated - For example, PCP, Patient, Cardiologist, Behavioral Professional, Oral Health Professional, Prescriber, etc... taken from the NUCC Health Care provider taxonomyCode system (OID: 2.16.840.1.113883.6.101).
         */
        USER, 
        /**
         * The settings in which the artifact is intended for use. For example, admission, pre-op, etc
         */
        WORKFLOW, 
        /**
         * The context for the clinical task(s) represented by this artifact. Can be any task context represented by the HL7 ActTaskCode value set (OID: 2.16.840.1.113883.1.11.19846). General categories include: order entry, patient documentation and patient information review.
         */
        TASK, 
        /**
         * The venue in which an artifact could be used. For example, Outpatient, Inpatient, Home, Nursing home. The code value may originate from either the HL7 ActEncounter (OID: 2.16.840.1.113883.1.11.13955) or NUCC non-individual provider codes OID: 2.16.840.1.113883.1.11.19465.
         */
        VENUE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static UsageContextType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("gender".equals(codeString))
          return GENDER;
        if ("age".equals(codeString))
          return AGE;
        if ("focus".equals(codeString))
          return FOCUS;
        if ("user".equals(codeString))
          return USER;
        if ("workflow".equals(codeString))
          return WORKFLOW;
        if ("task".equals(codeString))
          return TASK;
        if ("venue".equals(codeString))
          return VENUE;
        throw new FHIRException("Unknown UsageContextType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case GENDER: return "gender";
            case AGE: return "age";
            case FOCUS: return "focus";
            case USER: return "user";
            case WORKFLOW: return "workflow";
            case TASK: return "task";
            case VENUE: return "venue";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://hl7.org/fhir/usage-context-type";
        }
        public String getDefinition() {
          switch (this) {
            case GENDER: return "The gender of the patient. For this context type, the value should be a code taken from the [AdministrativeGender](valueset-administrative-gender.html) value set";
            case AGE: return "The age of the patient. For this context type, the value should be a range the specifies the applicable ages or a code from the MeSH value set AgeGroupObservationValue";
            case FOCUS: return "The clinical concept(s) addressed by the artifact. For example, disease, diagnostic test interpretation, medication ordering.";
            case USER: return "The clinical speciality of the context in which the patient is bring treated - For example, PCP, Patient, Cardiologist, Behavioral Professional, Oral Health Professional, Prescriber, etc... taken from the NUCC Health Care provider taxonomyCode system (OID: 2.16.840.1.113883.6.101).";
            case WORKFLOW: return "The settings in which the artifact is intended for use. For example, admission, pre-op, etc";
            case TASK: return "The context for the clinical task(s) represented by this artifact. Can be any task context represented by the HL7 ActTaskCode value set (OID: 2.16.840.1.113883.1.11.19846). General categories include: order entry, patient documentation and patient information review.";
            case VENUE: return "The venue in which an artifact could be used. For example, Outpatient, Inpatient, Home, Nursing home. The code value may originate from either the HL7 ActEncounter (OID: 2.16.840.1.113883.1.11.13955) or NUCC non-individual provider codes OID: 2.16.840.1.113883.1.11.19465.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case GENDER: return "Gender";
            case AGE: return "Age Range";
            case FOCUS: return "Clinical Focus";
            case USER: return "User Type";
            case WORKFLOW: return "Workflow Setting";
            case TASK: return "Workflow Task";
            case VENUE: return "Clinical Venue";
            default: return "?";
          }
    }


}

