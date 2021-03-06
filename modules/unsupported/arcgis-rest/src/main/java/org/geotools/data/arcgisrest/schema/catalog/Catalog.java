
package org.geotools.data.arcgisrest.schema.catalog;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Project Open Data Catalog
 * <p>
 * Validates an entire collection of Project Open Data metadata JSON objects. Agencies produce said collections in the form of Data.json files.
 * 
 */
public class Catalog {

    /**
     * Metadata Context
     * <p>
     * URL or JSON object for the JSON-LD Context that defines the schema used
     * 
     */
    @SerializedName("@context")
    @Expose
    private URI context;
    /**
     * Metadata Catalog ID
     * <p>
     * IRI for the JSON-LD Node Identifier of the Catalog. This should be the URL of the data.json file itself.
     * 
     */
    @SerializedName("@id")
    @Expose
    private URI id;
    /**
     * Metadata Context
     * <p>
     * IRI for the JSON-LD data type. This should be dcat:Catalog for the Catalog
     * 
     */
    @SerializedName("@type")
    @Expose
    private Catalog.Type type;
    /**
     * Version of Schema
     * <p>
     * Version of Schema
     * (Required)
     * 
     */
    @SerializedName("conformsTo")
    @Expose
    private Catalog.ConformsTo conformsTo;
    /**
     * Data Dictionary
     * <p>
     * URL for the JSON Schema file that defines the schema used
     * 
     */
    @SerializedName("describedBy")
    @Expose
    private URI describedBy;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("dataset")
    @Expose
    private List<Dataset> dataset = new ArrayList<Dataset>();

    /**
     * Metadata Context
     * <p>
     * URL or JSON object for the JSON-LD Context that defines the schema used
     * 
     * @return
     *     The context
     */
    public URI getContext() {
        return context;
    }

    /**
     * Metadata Context
     * <p>
     * URL or JSON object for the JSON-LD Context that defines the schema used
     * 
     * @param context
     *     The @context
     */
    public void setContext(URI context) {
        this.context = context;
    }

    /**
     * Metadata Catalog ID
     * <p>
     * IRI for the JSON-LD Node Identifier of the Catalog. This should be the URL of the data.json file itself.
     * 
     * @return
     *     The id
     */
    public URI getId() {
        return id;
    }

    /**
     * Metadata Catalog ID
     * <p>
     * IRI for the JSON-LD Node Identifier of the Catalog. This should be the URL of the data.json file itself.
     * 
     * @param id
     *     The @id
     */
    public void setId(URI id) {
        this.id = id;
    }

    /**
     * Metadata Context
     * <p>
     * IRI for the JSON-LD data type. This should be dcat:Catalog for the Catalog
     * 
     * @return
     *     The type
     */
    public Catalog.Type getType() {
        return type;
    }

    /**
     * Metadata Context
     * <p>
     * IRI for the JSON-LD data type. This should be dcat:Catalog for the Catalog
     * 
     * @param type
     *     The @type
     */
    public void setType(Catalog.Type type) {
        this.type = type;
    }

    /**
     * Version of Schema
     * <p>
     * Version of Schema
     * (Required)
     * 
     * @return
     *     The conformsTo
     */
    public Catalog.ConformsTo getConformsTo() {
        return conformsTo;
    }

    /**
     * Version of Schema
     * <p>
     * Version of Schema
     * (Required)
     * 
     * @param conformsTo
     *     The conformsTo
     */
    public void setConformsTo(Catalog.ConformsTo conformsTo) {
        this.conformsTo = conformsTo;
    }

    /**
     * Data Dictionary
     * <p>
     * URL for the JSON Schema file that defines the schema used
     * 
     * @return
     *     The describedBy
     */
    public URI getDescribedBy() {
        return describedBy;
    }

    /**
     * Data Dictionary
     * <p>
     * URL for the JSON Schema file that defines the schema used
     * 
     * @param describedBy
     *     The describedBy
     */
    public void setDescribedBy(URI describedBy) {
        this.describedBy = describedBy;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The dataset
     */
    public List<Dataset> getDataset() {
        return dataset;
    }

    /**
     * 
     * (Required)
     * 
     * @param dataset
     *     The dataset
     */
    public void setDataset(List<Dataset> dataset) {
        this.dataset = dataset;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(context).append(id).append(type).append(conformsTo).append(describedBy).append(dataset).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Catalog) == false) {
            return false;
        }
        Catalog rhs = ((Catalog) other);
        return new EqualsBuilder().append(context, rhs.context).append(id, rhs.id).append(type, rhs.type).append(conformsTo, rhs.conformsTo).append(describedBy, rhs.describedBy).append(dataset, rhs.dataset).isEquals();
    }

    public enum ConformsTo {

        @SerializedName("https://project-open-data.cio.gov/v1.1/schema")
        HTTPS_PROJECT_OPEN_DATA_CIO_GOV_V_1_1_SCHEMA("https://project-open-data.cio.gov/v1.1/schema");
        private final String value;
        private final static Map<String, Catalog.ConformsTo> CONSTANTS = new HashMap<String, Catalog.ConformsTo>();

        static {
            for (Catalog.ConformsTo c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ConformsTo(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static Catalog.ConformsTo fromValue(String value) {
            Catalog.ConformsTo constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Type {

        @SerializedName("dcat:Catalog")
        DCAT_CATALOG("dcat:Catalog");
        private final String value;
        private final static Map<String, Catalog.Type> CONSTANTS = new HashMap<String, Catalog.Type>();

        static {
            for (Catalog.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static Catalog.Type fromValue(String value) {
            Catalog.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
