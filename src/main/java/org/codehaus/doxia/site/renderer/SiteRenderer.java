package org.codehaus.doxia.site.renderer;

import org.codehaus.doxia.module.xhtml.XhtmlSink;

import java.io.File;
import java.io.InputStream;

/**
 * @author <a href="mailto:jason@maven.org">Jason van Zyl</a>
 * @version $Id: SiteRenderer.java,v 1.1 2004/09/15 01:04:04 jvanzyl Exp $
 */
public interface SiteRenderer
{
    String ROLE = SiteRenderer.class.getName();

    void render( String siteDirectory, String generatedSiteDirectory, String outputDirectory )
        throws Exception;

    void render( String siteDirectory, String generatedSiteDirectory, String outputDirectory, String flavour )
        throws Exception;

    void render( String siteDirectory, String generatedSiteDirectory, String outputDirectory, String flavour,
                 String siteDescriptorName )
        throws Exception;

    void render( String siteDirectory, String generatedSiteDirectory, String outputDirectory,
                 String flavour, InputStream siteDescriptor )
        throws Exception;

    XhtmlSink createSink( File moduleBasedir, String siteDirectory, String doc, String outputDirectory,
                          String siteDescriptorName, String flavour )
        throws Exception;

    XhtmlSink createSink( File moduleBasedir, String siteDirectory, String doc, String outputDirectory,
                          InputStream siteDescriptor, String flavour )
        throws Exception;

    void copyResources( String outputDirectory, String flavour, String siteDirectory )
        throws Exception;
}