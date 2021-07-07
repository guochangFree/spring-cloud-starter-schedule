/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ximalaya.schedule.core.common.constants;

import java.util.regex.Pattern;

public interface CommonConstants {

    String APPLICATION_KEY = "application";
    String REMOTE_APPLICATION_KEY = "remote.application";

    String ENABLED_KEY = "enabled";

    String ANY_VALUE = "*";

    char COMMA_SEPARATOR_CHAR = ',';

    String COMMA_SEPARATOR = ",";

    String DOT_SEPARATOR = ".";

    Pattern COMMA_SPLIT_PATTERN = Pattern.compile("\\s*[,]+\\s*");

    String PATH_SEPARATOR = "/";

    String PROTOCOL_SEPARATOR = "://";

    //String PROTOCOL_SEPARATOR_ENCODED = URL.encode(PROTOCOL_SEPARATOR);

    String REGISTRY_SEPARATOR = "|";

    String PROTOCOL_KEY = "protocol";

    String DEFAULT_KEY_PREFIX = "default.";

    String DEFAULT_KEY = "default";

    String ANYHOST_KEY = "anyhost";

    String ANYHOST_VALUE = "0.0.0.0";

    String LOCALHOST_KEY = "localhost";

    String LOCALHOST_VALUE = "127.0.0.1";

    String METHODS_KEY = "methods";

    String TIMESTAMP_KEY = "timestamp";

    String GROUP_KEY = "group";

    String PATH_KEY = "path";

    String INTERFACE_KEY = "interface";

    String VERSION_KEY = "version";

    String USERNAME_KEY = "username";
    String PASSWORD_KEY = "password";
    String HOST_KEY = "host";
    String PORT_KEY = "port";

    String DEFAULT_VERSION = "0.0.0";

    String NETWORK_IGNORED_INTERFACE = "schedule.network.interface.ignored";

    String PREFERRED_NETWORK_INTERFACE = "schedule.network.interface.preferred";

    String REMOVE_VALUE_PREFIX = "-";

    String CATEGORY_KEY = "category";

    String SIDE_KEY = "side";



}
