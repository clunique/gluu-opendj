/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License, Version 1.0 only
 * (the "License").  You may not use this file except in compliance
 * with the License.
 *
 * You can obtain a copy of the license at
 * trunk/opends/resource/legal-notices/OpenDS.LICENSE
 * or https://OpenDS.dev.java.net/OpenDS.LICENSE.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at
 * trunk/opends/resource/legal-notices/OpenDS.LICENSE.  If applicable,
 * add the following below this CDDL HEADER, with the fields enclosed
 * by brackets "[]" replaced with your own identifying information:
 *      Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 *
 *
 *      Copyright 2010 Sun Microsystems, Inc.
 */
package org.opends.guitools.controlpanel.event;

/**
 * This is the listener that receives events about the changes made in the
 * superiors of a given object class.  It is used mainly by the
 * {@link
 * org.opends.guitools.controlpanel.components.SuperiorObjectClassesEditor}
 * class.
 *
 */
public interface SuperiorObjectClassesChangedListener
{
  /**
   * Method called to notify the listener that a change has been made in the
   * superiors of an object class.
   * @param ev the event describing the new superior object classes.
   */
  void parentObjectClassesChanged(SuperiorObjectClassesChangedEvent ev);
}
