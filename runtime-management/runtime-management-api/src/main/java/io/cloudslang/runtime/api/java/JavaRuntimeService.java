package io.cloudslang.runtime.api.java;

/*******************************************************************************
 * (c) Copyright 2014 Hewlett-Packard Development Company, L.P.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License v2.0 which accompany this distribution.
 *
 * The Apache License is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *******************************************************************************/

/**
 * Created by Genadi Rabinovich, genadi@hpe.com on 05/05/2016.
 */
public interface JavaRuntimeService {

    /**
     * @param dependency - resource with maven GAV notation ‘groupId:artifactId:version’ which can be used to resolve resources with Maven Repository Support
     */

    Object execute (String dependency, String className, String methodName, JavaExecutionParametersProvider parametersProvider);
}
