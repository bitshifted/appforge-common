package co.bitshifted.ignite.common.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.File;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JavaDependencyDTO {

    private String groupId;
    private String artifactId;
    private String version;
    private String type;
    private String classifier;
    private String sha256;
    private long size;
    private boolean modular;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaDependencyDTO that = (JavaDependencyDTO) o;
        return groupId.equals(that.groupId) && artifactId.equals(that.artifactId) && version.equals(that.version) && Objects.equals(type, that.type) && Objects.equals(classifier, that.classifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, artifactId, version, type, classifier);
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClassifier() {
        return classifier;
    }

    public void setClassifier(String classifier) {
        this.classifier = classifier;
    }

    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public boolean isModular() {
        return modular;
    }

    public void setModular(boolean modular) {
        this.modular = modular;
    }

}
