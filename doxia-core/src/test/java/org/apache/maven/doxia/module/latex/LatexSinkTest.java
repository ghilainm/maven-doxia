package org.apache.maven.doxia.module.latex;

/*
 * Copyright 2004-2005 The Apache Software Foundation.
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

import org.apache.maven.doxia.module.latex.LatexSink;
import org.apache.maven.doxia.sink.Sink;
import org.apache.maven.doxia.AbstractSinkTestCase;

/**
 * @author <a href="mailto:jason@maven.org">Jason van Zyl</a>
 * @version $Id:LatexSinkTest.java 348605 2005-11-24 12:02:44 +1100 (Thu, 24 Nov 2005) brett $
 */
public class LatexSinkTest
    extends AbstractSinkTestCase
{
    protected String outputExtension()
    {
        return "tex";
    }

    protected Sink createSink()
        throws Exception
    {
        return new LatexSink( getTestWriter() );
    }
}