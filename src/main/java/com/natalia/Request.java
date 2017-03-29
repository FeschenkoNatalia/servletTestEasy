package com.natalia;


import java.util.List;

/**
 * Created by User on 18.03.2017.
 */

public class Request {
    private String method;
    private String URI;
    private List<String> attributes;

    public Request(String method, String URI) {
        this.method = method;
        this.URI = URI;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getURI() {
        return URI;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Request request = (Request) o;

        if (method != null ? !method.equals(request.method) : request.method != null) return false;
        if (URI != null ? !URI.equals(request.URI) : request.URI != null) return false;
        return attributes != null ? attributes.equals(request.attributes) : request.attributes == null;

    }

    @Override
    public int hashCode() {
        int result = method != null ? method.hashCode() : 0;
        result = 31 * result + (URI != null ? URI.hashCode() : 0);
        result = 31 * result + (attributes != null ? attributes.hashCode() : 0);
        return result;
    }
}


/*public class Request {
    private String method;
    private List<String > attributes;
    private String URI;

    public Request(String method, String URI){
        this.method = method;
        this.URI = URI;
    }

    public String getMethod(){
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    public String getURI() {
        return URI;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Request request = (Request) o;

        if (method != null ? !method.equals(request.method) : request.method != null) return false;
        return URI != null ? URI.equals(request.URI) : request.URI == null;
    }

    @Override
    public int hashCode() {
        int result = method != null ? method.hashCode() : 0;
        result = 31 * result + (URI != null ? URI.hashCode() : 0);
        return result;
    }
}*/
