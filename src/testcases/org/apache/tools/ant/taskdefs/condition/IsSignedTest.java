/*
 * Copyright  2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.tools.ant.taskdefs.condition;

import org.apache.tools.ant.BuildFileTest;

/**
 * Testcase for the &lt;issigned&gt; condition.
 *
 */
public class IsSignedTest extends BuildFileTest {

    public IsSignedTest(String name) {
        super(name);
    }
    public void setUp() {
        configureProject("src/etc/testcases/taskdefs/conditions/issigned.xml");
    }

    public void testPass() {
        executeTarget("pass");
    }
    public void testPassword() {
        executeTarget("password");
    }
    public void testAPassword() {
        executeTarget("apassword");
    }
    public void testAllSigned() {
        executeTarget("allsigned");
    }
}
