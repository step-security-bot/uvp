package org.opensourceway.uvp.pojo.osv;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.opensourceway.uvp.enums.Ecosystem;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OsvPackage {

    @JsonProperty(required = true)
    private Ecosystem ecosystem;

    @JsonProperty(required = true)
    private String name;

    private String purl;

    public Ecosystem getEcosystem() {
        return ecosystem;
    }

    public void setEcosystem(Ecosystem ecosystem) {
        this.ecosystem = ecosystem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OsvPackage that = (OsvPackage) o;
        return ecosystem == that.ecosystem
                && Objects.equals(name, that.name)
                && Objects.equals(purl, that.purl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecosystem, name, purl);
    }
}
