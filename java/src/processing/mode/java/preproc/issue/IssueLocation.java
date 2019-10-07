/* -*- mode: java; c-basic-offset: 2; indent-tabs-mode: nil -*- */

/*
Part of the Processing project - http://processing.org

Copyright (c) 2012-19 The Processing Foundation

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License version 2
as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software Foundation,
Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package processing.mode.java.preproc.issue;


/**
 * Data structure describing where an issue occurred.
 */
public class IssueLocation {

  private final int line;
  private final int charPosition;

  /**
   * Create a new issue location structure.
   *
   * @param newLine The line (1-indexed) where the issue occurred. This should be in the global file
   *    generated by the preprocessor and not relative to the start of the tab.
   * @param newCharPosition The position on the line.
   */
  public IssueLocation(int newLine, int newCharPosition) {
    line = newLine;
    charPosition = newCharPosition;
  }

  /**
   * Get the 1-indexed line on which this error occurred.
   *
   * @return The line on which this error occurred. Note that this will be relative to the global
   *    file generated by the preprocessor and not relative to the start of the tab.
   */
  public int getLine() {
    return line;
  }

  /**
   * The the position of the error within the line.
   *
   * @return The number of characters including whitespace from the start of the line at which the
   *    error occurred.
   */
  public int getCharPosition() {
    return charPosition;
  }

}