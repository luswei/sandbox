/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.integration.vertx;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author Gary Russell
 * @author fbalicchia
 */
public class Main
{

    public static void main(String[] args) throws Exception
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
            "META-INF/spring/integration/ws-context.xml");
        System.out.println("Hit enter to terminate...");
        System.in.read();
        ctx.close();
    }
}
