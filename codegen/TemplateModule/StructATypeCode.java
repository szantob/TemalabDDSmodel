
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package TemplateModule;

import com.rti.dds.typecode.*;

public class  StructATypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[1];

        sm[__i]=new  StructMember("foo", false, (short)-1,  false,(TypeCode) TypeCode.TC_DOUBLE,0 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("TemplateModule::StructA",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

