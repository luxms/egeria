/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */

package org.odpi.openmetadata.repositoryservices.auditlog;

import org.odpi.openmetadata.frameworks.auditlog.ComponentDescription;

/**
 * OMRSAuditingComponent provides identifying and background information about the components writing log records
 * to the OMRS Audit log.  This is to help someone reading the OMRS Audit Log understand the records.
 */
public enum OMRSAuditingComponent implements ComponentDescription
{
    UNKNOWN (0,
             "<Unknown>", "Uninitialized component name", "https://odpi.github.io/egeria-docs/services/"),

    AUDIT_LOG (1,
             "Audit Log",
             "Reads and writes records to the Open Metadata Repository Services (OMRS) audit log.",
             "https://odpi.github.io/egeria-docs/services/omrs/component-descriptions/audit-log/"),

    OPERATIONAL_SERVICES (3,
             "Operational Services",
             "Supports the administration services for the Open Metadata Repository Services (OMRS).",
             "https://odpi.github.io/egeria-docs/services/omrs/component-descriptions/operational-services/"),

    ARCHIVE_MANAGER (4,
             "Archive Manager",
             "Manages the loading of Open Metadata Archives into an open metadata repository.",
             "https://odpi.github.io/egeria-docs/services/omrs/component-descriptions/archive-manager/"),

    ENTERPRISE_CONNECTOR_MANAGER (5,
             "Enterprise Connector Manager",
             "Manages the list of open metadata repositories that the Enterprise OMRS Repository Connector " +
                                          "should call to retrieve an enterprise view of the metadata collections " +
                                          "supported by these repositories",
             "https://odpi.github.io/egeria-docs/services/omrs/component-descriptions/enterprise-repository-connector/"),

    ENTERPRISE_REPOSITORY_CONNECTOR (6,
             "Enterprise Repository Connector",
             "Supports enterprise access to the list of open metadata repositories registered " +
                                             "with the OMRS Enterprise Connector Manager.",
             "https://github.com/odpi/egeria/tree/master/open-metadata-implementation/repository-services/docs/component-descriptions/enterprise-repository-connector.md"),

    LOCAL_REPOSITORY_CONNECTOR (7,
             "Local Repository Connector",
             "Supports access to metadata stored in the local server's repository and ensures " +
                                        "repository events are generated when metadata changes in the local repository",
             "https://odpi.github.io/egeria-docs/services/omrs/component-descriptions/local-repository-connector/"),

    REPOSITORY_CONTENT_MANAGER(8,
             "Repository Content Manager",
             "Supports an in-memory cache for open metadata type definitions (TypeDefs) used for " +
             "verifying TypeDefs in use in other open metadata repositories and for " +
                             "constructing new metadata instances.",
             "https://odpi.github.io/egeria-docs/services/omrs/repository-content-manager/"),

    INSTANCE_EVENT_PROCESSOR (9,
             "Local Inbound Instance Event Processor",
             "Supports the loading of reference metadata into the local repository that has come from other members of the local server's cohorts and open metadata archives.",
             "https://odpi.github.io/egeria-docs/services/omrs/component-descriptions/local-repository-instance-event-processor/"),

    REPOSITORY_EVENT_MANAGER (10,
             "Repository Event Manager",
             "Distribute repository events (TypeDefs, Entity and Instance events) between internal OMRS components within a server.",
             "https://odpi.github.io/egeria-docs/services/omrs/component-descriptions/event-manager/"),

    REST_SERVICES (11,
             "Repository REST Services",
             "Provides the server-side support the the OMRS Repository Services REST API.",
             "https://odpi.github.io/egeria-docs/services/omrs/component-descriptions/omrs-rest-services/"),

    REST_REPOSITORY_CONNECTOR (12,
             "REST Repository Connector",
             "Supports an OMRS Repository Connector for calling the OMRS Repository REST API in a remote open metadata repository.",
             "https://odpi.github.io/egeria-docs/concepts/repository-connector"),

    METADATA_HIGHWAY_MANAGER (13,
             "Metadata Highway Manager",
             "Manages the initialization and shutdown of the components that connector to each of the cohorts that the local server is a member of.",
             "https://odpi.github.io/egeria-docs/services/omrs/component-descriptions/metadata-highway-manager/"),

    COHORT_MANAGER  (14,
             "Cohort Manager",
             "Manages the initialization and shutdown of the server's connectivity to a cohort.",
             "https://odpi.github.io/egeria-docs/services/omrs/component-descriptions/cohort-manager/"),

    COHORT_REGISTRY(15,
             "Cohort Registry",
             "Manages the registration requests send and received from this local repository.",
             "https://odpi.github.io/egeria-docs/services/omrs/component-descriptions/cohort-registry/"),

    REGISTRY_STORE  (16,
             "Registry Store",
             "Stores information about the repositories registered in the open metadata repository cohort.",
             "https://odpi.github.io/egeria-docs/concepts/cohort-registry-store-connector/"),

    EVENT_PUBLISHER (17,
             "Event Publisher",
             "Manages the publishing of events that this repository sends to the OMRS topic.",
             "https://odpi.github.io/egeria-docs/services/omrs/component-descriptions/event-publisher/"),

    EVENT_LISTENER  (18,
             "Event Listener",
             "Manages the receipt of incoming OMRS events.",
             "https://odpi.github.io/egeria-docs/services/omrs/component-descriptions/event-listener/"),

    OMRS_TOPIC_CONNECTOR(19,
             "OMRS Topic Connector",
             "Provides access to the OMRS Topic that is used to exchange events between members of a cohort, " +
                                 "or to notify Open Metadata Access Services (OMASs) of changes to " +
                                 "metadata in the enterprise.",
             "https://odpi.github.io/egeria-docs/services/omrs/component-descriptions/connectors/omrs-topic-connector/"),

    OPEN_METADATA_TOPIC_CONNECTOR(20,
             "Open Metadata Topic Connector",
             "Provides access to an event bus to exchange events with participants in the open metadata ecosystem.",
             "https://odpi.github.io/egeria-docs/concepts/open-metadata-topic-connector/"),

    LOCAL_REPOSITORY_EVENT_MAPPER(21,
             "Local Repository Event Mapper Connector",
             "Provides access to an event bus to process events from a specific local repository.",
             "https://odpi.github.io/egeria-docs/concepts/event-mapper-connector/"),

    ARCHIVE_STORE_CONNECTOR(22,
             "Open Metadata Archive Store Connector",
             "Reads and writes open metadata types and instances to an open metadata archive.",
             "https://odpi.github.io/egeria-docs/concepts/open-metadata-archive-store-connector/"),

    REMOTE_REPOSITORY_CONNECTOR(23,
             "Cohort Member Client Open Metadata Repository Connector",
             "Provides access to open metadata located in a remote repository for remote members of a cohort.",
             "https://odpi.github.io/egeria-docs/concepts/cohort-member-client-connector/"),

    OMAS_OUT_TOPIC(24,
             "Open Metadata Access Service (OMAS) Out Topic",
             "Publishes events from a specific access service.",
             "https://odpi.github.io/egeria-docs/concepts/out-topic/"),

    OMAS_IN_TOPIC(25,
             "Open Metadata Access Service (OMAS) In Topic",
             "Receives events from external servers and tools directed at a specific access service.",
             "https://odpi.github.io/egeria-docs/concepts/in-topic/"),

    ENTERPRISE_TOPIC_LISTENER(26,
             "Enterprise Topic Listener",
             "Receives events from the open metadata repository cohorts that this server is registered with and distributes " +
                                      "them to the Open Metadata Access Services (OMASs).",
             "https://odpi.github.io/egeria-docs/concepts/cohort-events/"),

    REPOSITORY_CONNECTOR(27,
             "OMRS Repository Connector",
             "Maps open metadata calls to a metadata repository.",
             "https://odpi.github.io/egeria-docs/concepts/repository-connector/"),

    OPEN_DISCOVERY_SERVICE_CONNECTOR(28,
             "Open Discovery Service Connector",
             "A connector that analyzing the contents of a digital resource.",
             "https://odpi.github.io/egeria-docs/guides/developer/open-discovery-services/overview/"),

    GOVERNANCE_ACTION_SERVICE_CONNECTOR(29,
             "Governance Action Service Connector",
             "A connector that coordinates governance of digital resources and metadata.",
             "https://odpi.github.io/egeria-docs/guides/developer/governance-action-services/overview/"),

    ARCHIVE_SERVICE_CONNECTOR(30,
             "Archive Service Connector",
             "A connector that dynamically manages open metadata archives.",
             "https://odpi.github.io/egeria-docs/guides/developer/archive-services/overview/"),

    INTEGRATION_CONNECTOR(31,
             "Integration Connector",
             "Connector that manages metadata exchange with a third party technology.",
             "https://odpi.github.io/egeria-docs/concepts/integration-connector/"),

    PLATFORM_SECURITY_CONNECTOR(32,
             "Platform Metadata Security Connector",
             "Connector that manages authorization requests to the OMAG Server Platform.",
             "https://odpi.github.io/egeria-docs/concepts/platform-metadata-security-connector/"),

    SERVER_SECURITY_CONNECTOR(33,
             "Server Metadata Security Connector",
             "Connector that manages authorization requests to the OMAG Server.",
             "https://odpi.github.io/egeria-docs/concepts/server-metadata-security-connector/"),
    ;


    private  int      componentId;
    private  String   componentName;
    private  String   componentDescription;
    private  String   componentWikiURL;


    /**
     * Set up the values of the enum.
     *
     * @param componentId code number for the component.
     * @param componentName name of the component used in the audit log record.
     * @param componentDescription short description of the component.
     * @param componentWikiURL URL link to the description of the component.
     */
    OMRSAuditingComponent(int    componentId,
                          String componentName,
                          String componentDescription,
                          String componentWikiURL)
    {
        this.componentId = componentId;
        this.componentName = componentName;
        this.componentDescription = componentDescription;
        this.componentWikiURL = componentWikiURL;
    }


    /**
     * Return the numerical code for this component.
     *
     * @return int componentId
     */
    public int getComponentId()
    {
        return componentId;
    }


    /**
     * Return the name of the component.  This is the name used in the audit log records.
     *
     * @return String component name
     */
    public String getComponentName()
    {
        return componentName;
    }


    /**
     * Return the short description of the component. This is an English description.  Natural language support for
     * these values can be added to UIs using a resource bundle indexed with the component Id.  This value is
     * provided as a default if the resource bundle is not available.
     *
     * @return String description
     */
    public String getComponentType()
    {
        return componentDescription;
    }

    /**
     * URL link to the wiki page that describes this component.  This provides more information to the log reader
     * on the operation of the component.
     *
     * @return String URL
     */
    public String getComponentWikiURL()
    {
        return componentWikiURL;
    }


    /**
     * toString, JSON-style
     *
     * @return string description
     */
    @Override
    public String toString()
    {
        return "OMRSAuditingComponent{" +
                "componentId=" + componentId +
                ", componentName='" + componentName + '\'' +
                ", componentDescription='" + componentDescription + '\'' +
                ", componentWikiURL='" + componentWikiURL + '\'' +
                '}';
    }
}
