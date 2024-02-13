/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.drools.drl.parser.lang;

import java.util.List;

import org.antlr.runtime.Token;
import org.drools.drl.parser.DroolsParserException;

/**
 * No implementation because everything is handled by DRL10Parser
 */
public class DRL10Lexer implements DRLLexer {

    @Override
    public String getSourceName() {
        throw new UnsupportedOperationException("This method should not be called");
    }

    @Override
    public Token nextToken() {
        throw new UnsupportedOperationException("This method should not be called");
    }

    @Override
    public List<DroolsParserException> getErrors() {
        throw new UnsupportedOperationException("This method should not be called");
    }

}