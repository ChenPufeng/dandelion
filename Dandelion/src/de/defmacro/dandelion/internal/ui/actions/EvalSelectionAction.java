/*
 Dandelion, a Lisp plugin for Eclipse.
 Copyright (C) 2007 Michael Bohn

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License along
 with this program; if not, write to the Free Software Foundation, Inc.,
 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package de.defmacro.dandelion.internal.ui.actions;

import de.defmacro.dandelion.internal.LispPluginActivator;
import de.defmacro.dandelion.internal.ui.*;
import de.defmacro.dandelion.internal.ui.editor.ILispSourceSelection;
import de.defmacro.dandelion.internal.ui.text.StructureException;

/**
 * Die Aktion fuer Evaluierung einer Selektion.
 * @author Michael Bohn
 *
 */
public class EvalSelectionAction 
extends EvalAction 
{	
	private static final String EVAL_SELECTION_COMMAND_ID = LispPluginActivator.NS + ".commands.editor.evalSelection";
	
	/**
	 * Erzeugt eine neuen Selektion fuer
	 * Selektion einer Editorauswahl.
	 */
	public EvalSelectionAction() {
		setText("Evaluate Selection");
		setImageDescriptor(LispUI.getUIImageManager().getDescriptor(UIImageConstants.ICON_EVALUATE_SELECTION));
		setActionDefinitionId(EVAL_SELECTION_COMMAND_ID);
	}
	
	/**
	 * Liefert die aktuelle Selektion im Editor.
	 */
	@Override
	public ILispSourceSelection getSelection() 
	throws StructureException {
		ILispSourceSelection sel = getEditor().getSourceSelection();
		return sel;
	}
}
