package org.codehaus.doxia.site.renderer;

/**
 * @author <a href="mailto:jason@maven.org">Jason van Zyl</a>
 * @version $Id: SiteRenderer.java,v 1.1 2004/09/15 01:04:04 jvanzyl Exp $
 */
public interface SiteRenderer
{
    String ROLE = SiteRenderer.class.getName();

    void render( String siteDirectory, String generatedSiteDirectory, String outputDirectory )
        throws Exception;
}