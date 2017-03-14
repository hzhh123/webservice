
package com.webservice.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservice.cxf package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Add_QNAME = new QName("http://cxf.webservice.com/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://cxf.webservice.com/", "addResponse");
    private final static QName _GetRoles_QNAME = new QName("http://cxf.webservice.com/", "getRoles");
    private final static QName _GetRolesByUser_QNAME = new QName("http://cxf.webservice.com/", "getRolesByUser");
    private final static QName _GetRolesByUserResponse_QNAME = new QName("http://cxf.webservice.com/", "getRolesByUserResponse");
    private final static QName _GetRolesResponse_QNAME = new QName("http://cxf.webservice.com/", "getRolesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservice.cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link GetRoles }
     * 
     */
    public GetRoles createGetRoles() {
        return new GetRoles();
    }

    /**
     * Create an instance of {@link GetRolesByUser }
     * 
     */
    public GetRolesByUser createGetRolesByUser() {
        return new GetRolesByUser();
    }

    /**
     * Create an instance of {@link GetRolesByUserResponse }
     * 
     */
    public GetRolesByUserResponse createGetRolesByUserResponse() {
        return new GetRolesByUserResponse();
    }

    /**
     * Create an instance of {@link GetRolesResponse }
     * 
     */
    public GetRolesResponse createGetRolesResponse() {
        return new GetRolesResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link MyRole }
     * 
     */
    public MyRole createMyRole() {
        return new MyRole();
    }

    /**
     * Create an instance of {@link MyRoleArray }
     * 
     */
    public MyRoleArray createMyRoleArray() {
        return new MyRoleArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.webservice.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.webservice.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.webservice.com/", name = "getRoles")
    public JAXBElement<GetRoles> createGetRoles(GetRoles value) {
        return new JAXBElement<GetRoles>(_GetRoles_QNAME, GetRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.webservice.com/", name = "getRolesByUser")
    public JAXBElement<GetRolesByUser> createGetRolesByUser(GetRolesByUser value) {
        return new JAXBElement<GetRolesByUser>(_GetRolesByUser_QNAME, GetRolesByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.webservice.com/", name = "getRolesByUserResponse")
    public JAXBElement<GetRolesByUserResponse> createGetRolesByUserResponse(GetRolesByUserResponse value) {
        return new JAXBElement<GetRolesByUserResponse>(_GetRolesByUserResponse_QNAME, GetRolesByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.webservice.com/", name = "getRolesResponse")
    public JAXBElement<GetRolesResponse> createGetRolesResponse(GetRolesResponse value) {
        return new JAXBElement<GetRolesResponse>(_GetRolesResponse_QNAME, GetRolesResponse.class, null, value);
    }

}
