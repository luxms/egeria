/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.governanceservers.openlineage.server.spring;


import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.odpi.openmetadata.governanceservers.openlineage.model.LineageQueryParameters;
import org.odpi.openmetadata.governanceservers.openlineage.responses.LineageResponse;
import org.odpi.openmetadata.governanceservers.openlineage.responses.LineageVertexResponse;
import org.odpi.openmetadata.governanceservers.openlineage.server.OpenLineageRestServices;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * * The OpenLineageResource provides the server-side interface of the Open Lineage Services governance server.
 */
@RestController
@RequestMapping("/servers/{serverName}/open-metadata/open-lineage/users/{userId}")

@Tag(name="Open Lineage Services", description="The Open Lineage Services provides a historic reporting warehouse for lineage. It listens to events that are sent out by the Asset Lineage OMAS, and stores lineage data in a database. ", externalDocs=@ExternalDocumentation(description="Open Lineage Services",url="https://odpi.github.io/egeria-docs/services/open-lineage-services/"))

public class OpenLineageResource {

    private final OpenLineageRestServices restAPI = new OpenLineageRestServices();

    /**
     * Returns the graph that the user will initially see when querying lineage. In the future, this method will be
     * extended to condense large paths to prevent cluttering of the users screen. The user will be able to extended
     * the condensed path by querying a different method.
     *
     * @param userId     calling user.
     * @param serverName name of the server instance to connect to.
     * @param params
     * @return A subgraph containing all relevant paths, in graphSON format.
     */
    @PostMapping(path = "/lineage/entities/{guid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public LineageResponse lineage(
            @PathVariable("serverName") String serverName,
            @PathVariable("userId") String userId,
            @PathVariable("guid") String guid,
            @RequestBody LineageQueryParameters params) {
        return restAPI.lineage(serverName, userId, params.getScope(), guid, params.getDisplayNameMustContain(), params.isIncludeProcesses());
    }

    /**
     * Gets entity details.
     *
     * @param serverName the server name
     * @param userId     the user id
     * @param guid       the guid
     * @return the entity details
     */
    @GetMapping(path = "/lineage/entities/{guid}/details", produces = MediaType.APPLICATION_JSON_VALUE)
    public LineageVertexResponse getEntityDetails(
            @PathVariable("serverName") String serverName,
            @PathVariable("userId") String userId,
            @PathVariable("guid") String guid) {
        return restAPI.getEntityDetails(serverName, userId, guid);
    }

}
