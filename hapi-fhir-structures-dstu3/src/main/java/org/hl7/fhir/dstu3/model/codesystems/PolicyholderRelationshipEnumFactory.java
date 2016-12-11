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


import org.hl7.fhir.dstu3.model.EnumFactory;

public class PolicyholderRelationshipEnumFactory implements EnumFactory<PolicyholderRelationship> {

  public PolicyholderRelationship fromCode(String codeString) throws IllegalArgumentException {
    if (codeString == null || "".equals(codeString))
      return null;
    if ("child".equals(codeString))
      return PolicyholderRelationship.CHILD;
    if ("parent".equals(codeString))
      return PolicyholderRelationship.PARENT;
    if ("spouse".equals(codeString))
      return PolicyholderRelationship.SPOUSE;
    if ("common".equals(codeString))
      return PolicyholderRelationship.COMMON;
    if ("other".equals(codeString))
      return PolicyholderRelationship.OTHER;
    if ("self".equals(codeString))
      return PolicyholderRelationship.SELF;
    throw new IllegalArgumentException("Unknown PolicyholderRelationship code '"+codeString+"'");
  }

  public String toCode(PolicyholderRelationship code) {
    if (code == PolicyholderRelationship.CHILD)
      return "child";
    if (code == PolicyholderRelationship.PARENT)
      return "parent";
    if (code == PolicyholderRelationship.SPOUSE)
      return "spouse";
    if (code == PolicyholderRelationship.COMMON)
      return "common";
    if (code == PolicyholderRelationship.OTHER)
      return "other";
    if (code == PolicyholderRelationship.SELF)
      return "self";
    return "?";
  }

    public String toSystem(PolicyholderRelationship code) {
      return code.getSystem();
      }

}

