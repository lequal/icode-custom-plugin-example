/************************************************************************************************/
/* i-Code CNES is a static code analyzer.                                                       */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */
/* http://www.eclipse.org/legal/epl-v10.html                                                    */
/************************************************************************************************/
package fr.cnes.icode.c.checkers;

import fr.cnes.icode.data.CheckersDefinition;

/**
 * Define checkers to be supported by this plugin.
 */
public class CCheckersDefinition extends CheckersDefinition {

    /**
     * Override this method to inject checkers in containers field.
     */
    @Override
    public void define() {
        addFromResources("/c-checkers.xml");
    }

}
