/*
 * Copyright 2017 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.conversation.v1.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * WorkspaceExportResponse.
 */
public class WorkspaceExportResponse extends GenericModel {


  /**
   * Classifier Status.
   */
  public enum Status {

    /** The available. */
    @SerializedName("Available") AVAILABLE,

    /** The failed. */
    @SerializedName("Failed") FAILED,

    /** The non existent. */
    @SerializedName("Non Existent") NON_EXISTENT,

    /** The training. */
    @SerializedName("Training") TRAINING,

    /** The unavailable. */
    @SerializedName("Unavailable") UNAVAILABLE
  }

  /** The name of the workspace. */
  private String name;
  /** The description of the workspace. */
  private String description;
  /** The language of the workspace. */
  private String language;
  /** Any metadata that is required by the workspace. */
  private Map<String, Object> metadata;
  /** The timestamp for creation of the workspace. */
  private Date created;
  /** The timestamp for the last update to the workspace. */
  private Date updated;
  /** The workspace ID. */
  @SerializedName("workspace_id")
  private String workspaceId;
  /** The current status of the workspace (`Non Existent`, `Training`, `Failed`, `Available`, or `Unavailable`). */
  private Status status;
  /** An array of intents. */
  private List<IntentExportResponse> intents;
  /** An array of entities. */
  private List<EntityExportResponse> entities;
  /** An array of counterexamples. */
  private List<ExampleResponse> counterexamples;

  /**
   * Gets the name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the language.
   *
   * @return the language
   */
  public String getLanguage() {
    return language;
  }

  /**
   * Gets the metadata.
   *
   * @return the metadata
   */
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  /**
   * Gets the created.
   *
   * @return the created
   */
  public Date getCreated() {
    return created;
  }

  /**
   * Gets the updated.
   *
   * @return the updated
   */
  public Date getUpdated() {
    return updated;
  }

  /**
   * Gets the workspaceId.
   *
   * @return the workspaceId
   */
  public String getWorkspaceId() {
    return workspaceId;
  }

  /**
   * Gets the status.
   *
   * @return the status
   */
  public Status getStatus() {
    return status;
  }

  /**
   * Gets the intents.
   *
   * @return the intents
   */
  public List<IntentExportResponse> getIntents() {
    return intents;
  }

  /**
   * Gets the entities.
   *
   * @return the entities
   */
  public List<EntityExportResponse> getEntities() {
    return entities;
  }

  /**
   * Gets the counterexamples.
   *
   * @return the counterexamples
   */
  public List<ExampleResponse> getCounterexamples() {
    return counterexamples;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Sets the description.
   *
   * @param description the new description
   */
  public void setDescription(final String description) {
    this.description = description;
  }

  /**
   * Sets the language.
   *
   * @param language the new language
   */
  public void setLanguage(final String language) {
    this.language = language;
  }

  /**
   * Sets the metadata.
   *
   * @param metadata the new metadata
   */
  public void setMetadata(final Map<String, Object> metadata) {
    this.metadata = metadata;
  }

  /**
   * Sets the created.
   *
   * @param created the new created
   */
  public void setCreated(final Date created) {
    this.created = created;
  }

  /**
   * Sets the updated.
   *
   * @param updated the new updated
   */
  public void setUpdated(final Date updated) {
    this.updated = updated;
  }

  /**
   * Sets the workspaceId.
   *
   * @param workspaceId the new workspaceId
   */
  public void setWorkspaceId(final String workspaceId) {
    this.workspaceId = workspaceId;
  }

  /**
   * Sets the status.
   *
   * @param status the new status
   */
  public void setStatus(final Status status) {
    this.status = status;
  }

  /**
   * Sets the intents.
   *
   * @param intents the new intents
   */
  public void setIntents(final List<IntentExportResponse> intents) {
    this.intents = intents;
  }

  /**
   * Sets the entities.
   *
   * @param entities the new entities
   */
  public void setEntities(final List<EntityExportResponse> entities) {
    this.entities = entities;
  }

  /**
   * Sets the counterexamples.
   *
   * @param counterexamples the new counterexamples
   */
  public void setCounterexamples(final List<ExampleResponse> counterexamples) {
    this.counterexamples = counterexamples;
  }
}
