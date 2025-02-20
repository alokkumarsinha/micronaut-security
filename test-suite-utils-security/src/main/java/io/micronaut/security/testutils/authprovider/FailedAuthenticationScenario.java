/*
 * Copyright 2017-2021 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.security.testutils.authprovider;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.security.authentication.AuthenticationFailureReason;

/**
 * Failed Authentication Scenario.
 */
@Introspected
public class FailedAuthenticationScenario {

    @NonNull
    private String username;

    @NonNull
    private AuthenticationFailureReason reason;

    /**
     *
     * @param username username
     * @param reason reason for failure
     */
    public FailedAuthenticationScenario(@NonNull String username,
                                        @NonNull AuthenticationFailureReason reason) {
        this.username = username;
        this.reason = reason;
    }

    /**
     *
     * @return username
     */
    @NonNull
    public String getUsername() {
        return username;
    }

    /**
     *
     * @return Failure reason
     */
    @NonNull
    public AuthenticationFailureReason getReason() {
        return reason;
    }
}
