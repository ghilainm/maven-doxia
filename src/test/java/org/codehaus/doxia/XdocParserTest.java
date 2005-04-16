package org.codehaus.doxia;

import org.codehaus.doxia.module.xdoc.XdocParser;
import org.codehaus.doxia.module.xhtml.decoration.render.RenderingContext;
import org.codehaus.doxia.module.xhtml.codehaus.CodehausXhtmlSink;
import org.codehaus.doxia.module.xhtml.codehaus.CodehausXhtmlSink;
import org.codehaus.doxia.module.xhtml.decoration.model.PathTool;
import org.codehaus.doxia.module.xhtml.decoration.model.MavenDecorationModel;
import org.codehaus.doxia.module.xhtml.decoration.model.MavenDecorationModel;
import org.codehaus.doxia.module.xhtml.decoration.model.MavenDecorationModelReader;
import org.codehaus.doxia.module.xhtml.decoration.model.MavenDecorationModelReader;
import org.codehaus.doxia.sink.Sink;
import junit.framework.TestCase;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * @author <a href="mailto:jason@maven.org">Jason van Zyl</a>
 * @version $Id: XdocParserTest.java,v 1.4 2004/09/14 14:26:38 jvanzyl Exp $
 */
public class XdocParserTest
    extends TestCase
{
    public void testApt()
        throws Exception
    {
        String basedir = System.getProperty( "basedir" );

        String siteXml = new File( basedir, "src/test/site/site.xml").getPath();

        XdocParser xdocParser = new XdocParser();

        Reader reader = new FileReader( new File( basedir, "src/test/site/xdoc/report.xml" ) );

        Writer writer = new FileWriter( "repository-upload.html" );

        String xdoc = "repository-upload.xml";

        MavenDecorationModelReader b = new MavenDecorationModelReader();

        MavenDecorationModel navigation = b.createNavigation( siteXml );

        RenderingContext renderingContext = new RenderingContext( basedir, 
                                                                  new File( basedir, xdoc ).getPath(),
                                                                  navigation );

        Sink sink = new CodehausXhtmlSink( writer, renderingContext );

        xdocParser.parse( reader, sink );
    }
}