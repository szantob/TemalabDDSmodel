

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package TemplateModule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class StructB   implements Copyable, Serializable{

    public double foo= 0;
    public TemplateModule.StructA bar = (TemplateModule.StructA)TemplateModule.StructA.create();

    public StructB() {

    }
    public StructB (StructB other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        StructB self;
        self = new  StructB();
        self.clear();
        return self;

    }

    public void clear() {

        foo= 0;
        if (bar != null) {
            bar.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        StructB otherObj = (StructB)o;

        if(foo != otherObj.foo) {
            return false;
        }
        if(!bar.equals(otherObj.bar)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)foo;
        __result += bar.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>StructBTypeSupport</code>
    * rather than here by using the <code>-noCopyable</code> option
    * to rtiddsgen.
    * 
    * @param src The Object which contains the data to be copied.
    * @return Returns <code>this</code>.
    * @exception NullPointerException If <code>src</code> is null.
    * @exception ClassCastException If <code>src</code> is not the 
    * same type as <code>this</code>.
    * @see com.rti.dds.infrastructure.Copyable#copy_from(java.lang.Object)
    */
    public Object copy_from(Object src) {

        StructB typedSrc = (StructB) src;
        StructB typedDst = this;

        typedDst.foo = typedSrc.foo;
        typedDst.bar = (TemplateModule.StructA) typedDst.bar.copy_from(typedSrc.bar);

        return this;
    }

    public String toString(){
        return toString("", 0);
    }

    public String toString(String desc, int indent) {
        StringBuffer strBuffer = new StringBuffer();        

        if (desc != null) {
            CdrHelper.printIndent(strBuffer, indent);
            strBuffer.append(desc).append(":\n");
        }

        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("foo: ").append(foo).append("\n");  
        strBuffer.append(bar.toString("bar ", indent+1));

        return strBuffer.toString();
    }

}
