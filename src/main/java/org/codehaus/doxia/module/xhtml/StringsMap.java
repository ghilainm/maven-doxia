/*
 * Copyright (c) 2004 Your Corporation. All Rights Reserved.
 */
package org.codehaus.doxia.module.xhtml;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:jason@maven.org">Jason van Zyl</a>
 * @version $Id: StringsMap.java,v 1.1 2004/09/22 00:01:42 jvanzyl Exp $
 */
public class StringsMap
    extends HashMap
{
    private Map map;

    public StringsMap( Map map )
    {
        this.map = map;
    }

    public String get( String key )
    {
        return (String) map.get( key );        
    }
}