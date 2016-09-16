
package us.kbase.narrativejobservice;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: CheckJobsResults</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "job_states",
    "job_params"
})
public class CheckJobsResults {

    @JsonProperty("job_states")
    private Map<String, JobState> jobStates;
    @JsonProperty("job_params")
    private Map<String, RunJobParams> jobParams;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("job_states")
    public Map<String, JobState> getJobStates() {
        return jobStates;
    }

    @JsonProperty("job_states")
    public void setJobStates(Map<String, JobState> jobStates) {
        this.jobStates = jobStates;
    }

    public CheckJobsResults withJobStates(Map<String, JobState> jobStates) {
        this.jobStates = jobStates;
        return this;
    }

    @JsonProperty("job_params")
    public Map<String, RunJobParams> getJobParams() {
        return jobParams;
    }

    @JsonProperty("job_params")
    public void setJobParams(Map<String, RunJobParams> jobParams) {
        this.jobParams = jobParams;
    }

    public CheckJobsResults withJobParams(Map<String, RunJobParams> jobParams) {
        this.jobParams = jobParams;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((("CheckJobsResults"+" [jobStates=")+ jobStates)+", jobParams=")+ jobParams)+", additionalProperties=")+ additionalProperties)+"]");
    }

}