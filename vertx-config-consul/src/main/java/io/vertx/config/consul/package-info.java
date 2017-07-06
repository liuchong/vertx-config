/**
 * === Consul Configuration Store
 *
 * The Consul Configuration Store extends the Vert.x Configuration Retriever and provides the
 * way to retrieve configuration from a Consul.
 *
 * ==== Using the Consul Configuration Store
 *
 * To use the Consul Configuration Store, add the following dependency to the
 * _dependencies_ section of your build descriptor:
 *
 * * Maven (in your `pom.xml`):
 *
 * [source,xml,subs="+attributes"]
 * ----
 * <dependency>
 *   <groupId>${maven.groupId}</groupId>
 *   <artifactId>${maven.artifactId}</artifactId>
 *   <version>${maven.version}</version>
 * </dependency>
 * <dependency>
 *   <groupId>${maven.groupId}</groupId>
 *   <artifactId>vertx-config</artifactId>
 *   <version>${maven.version}</version>
 * </dependency>
 * ----
 *
 * * Gradle (in your `build.gradle` file):
 *
 * [source,groovy,subs="+attributes"]
 * ----
 * compile '${maven.groupId}:vertx-config:${maven.version}'
 * compile '${maven.groupId}:${maven.artifactId}:${maven.version}'
 * ----
 *
 * ==== Configuring the store
 *
 * Once added to your classpath or dependencies, you need to configure the
 * {@link io.vertx.config.ConfigRetriever} to use this store:
 *
 * [source, $lang]
 * ----
 * {@link examples.Examples#example1(io.vertx.core.Vertx)}
 * ----
 *
 * The store configuration is used to create an instance of
 * {@link io.vertx.ext.consul.ConsulClient}. Check the documentation of the Vert.x Consul Client
 * for further details.
 *
 */
@Document(fileName = "consul-store.adoc")
@ModuleGen(name = "vertx-config", groupPackage = "io.vertx")
package io.vertx.config.consul;

import io.vertx.codegen.annotations.ModuleGen;
import io.vertx.docgen.Document;
