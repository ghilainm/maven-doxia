package org.codehaus.doxia.macro.manager;

/**
 * @author <a href="mailto:jason@maven.org">Jason van Zyl</a>
 * @version $Id: MacroNotFoundException.java,v 1.1 2004/09/14 14:26:38 jvanzyl Exp $
 */
public class MacroNotFoundException
    extends Exception
{
    public MacroNotFoundException( String message )
    {
        super( message );
    }

    public MacroNotFoundException( Throwable cause )
    {
        super( cause );
    }

    public MacroNotFoundException( String message, Throwable cause )
    {
        super( message, cause );
    }
}