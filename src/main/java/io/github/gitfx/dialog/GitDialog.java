/**
 * Copyright 2015 GitFx
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package io.github.gitfx.dialog;

import java.util.List;
import javafx.scene.control.Dialog;
import javafx.util.Pair;

/**
 * Interface for the GitDialog This is part of the facade implementation to
 * encapsulate dialog libraries
 *
 * @author rvvaidya
 */
public interface GitDialog {
    /*
     *Generic Exception Dialog 
     */

    public void gitExceptionDialog(String title, String header, String content, Exception e);
    /*
     *Generic information dialog
     */

    public Dialog gitInformationDialog(String title, String header, String content);
    /*
     *Generic Error dialog 
     */

    public void gitErrorDialog(String title, String error, String content);
    /*
     *Generic Alert dialog
     */

    public void gitWarningDialog(String title, String header, String content);
    /*
     * Git Open Dialog. This is a specific dialog for Git Open functionality
     */

    public String gitOpenDialog(String title, String header, String content);
    /*
     * Implementation of Git Open Dialog. 
     */

    public Pair<String, String> gitInitDialog(String title, String header, String content);
    /*
     * Implementation of Git Open Dialog. 
     */

    public Pair<String, String> gitCloneDialog(String title, String header, String content);
    /*
     * Generic confirmation dialog
     */

    public void gitConfirmationDialog(String title, String header, String content);
    /*
     * GitFxDialogResponse to capture responses from all dialog types
     */
  
    public GitFxDialogResponse getResponse();
    /*
     * gitFxInformationListDialog 
     */
    public String gitFxInformationListDialog(String title, String header, String content,List list);
}
