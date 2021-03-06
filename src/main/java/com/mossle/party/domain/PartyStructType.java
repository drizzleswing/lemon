package com.mossle.party.domain;

// Generated by Hibernate Tools
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PartyStructType .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "PARTY_STRUCT_TYPE")
public class PartyStructType implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private PartyDim partyDim;

    /** null. */
    private String name;

    /** null. */
    private String ref;

    /** null. */
    private String scopeId;

    /** . */
    private Set<PartyStructRule> partyStructRules = new HashSet<PartyStructRule>(
            0);

    /** . */
    private Set<PartyStruct> partyStructs = new HashSet<PartyStruct>(0);

    public PartyStructType() {
    }

    public PartyStructType(PartyDim partyDim, String name, String ref,
            String scopeId, Set<PartyStructRule> partyStructRules,
            Set<PartyStruct> partyStructs) {
        this.partyDim = partyDim;
        this.name = name;
        this.ref = ref;
        this.scopeId = scopeId;
        this.partyStructRules = partyStructRules;
        this.partyStructs = partyStructs;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DIM_ID")
    public PartyDim getPartyDim() {
        return this.partyDim;
    }

    /**
     * @param partyDim
     *            null.
     */
    public void setPartyDim(PartyDim partyDim) {
        this.partyDim = partyDim;
    }

    /** @return null. */
    @Column(name = "NAME", length = 50)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "REF", length = 50)
    public String getRef() {
        return this.ref;
    }

    /**
     * @param ref
     *            null.
     */
    public void setRef(String ref) {
        this.ref = ref;
    }

    /** @return null. */
    @Column(name = "SCOPE_ID", length = 50)
    public String getScopeId() {
        return this.scopeId;
    }

    /**
     * @param scopeId
     *            null.
     */
    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "partyStructType")
    public Set<PartyStructRule> getPartyStructRules() {
        return this.partyStructRules;
    }

    /**
     * @param partyStructRules
     *            .
     */
    public void setPartyStructRules(Set<PartyStructRule> partyStructRules) {
        this.partyStructRules = partyStructRules;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "partyStructType")
    public Set<PartyStruct> getPartyStructs() {
        return this.partyStructs;
    }

    /**
     * @param partyStructs
     *            .
     */
    public void setPartyStructs(Set<PartyStruct> partyStructs) {
        this.partyStructs = partyStructs;
    }
}
