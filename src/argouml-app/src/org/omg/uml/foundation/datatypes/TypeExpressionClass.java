package org.omg.uml.foundation.datatypes;

/**
 * TypeExpression class proxy interface.
 */
public interface TypeExpressionClass extends javax.jmi.reflect.RefClass {
    /**
     * The default factory operation used to create an instance object.
     * @return The created instance object.
     */
    public TypeExpression createTypeExpression();
    /**
     * Creates an instance object having attributes initialized by the passed 
     * values.
     * @param language 
     * @param body 
     * @return The created instance object.
     */
    public TypeExpression createTypeExpression(java.lang.String language, java.lang.String body);
}
