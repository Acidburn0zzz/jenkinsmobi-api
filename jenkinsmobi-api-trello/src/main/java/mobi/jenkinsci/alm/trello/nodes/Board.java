// Copyright (C) 2013 GerritForge www.gerritforge.com
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package mobi.jenkinsci.alm.trello.nodes;

import java.util.HashMap;

public class Board extends TrelloObject {

  public String desc;
  public boolean closed;
  public String idOrganization;
  public boolean pinned;
  public String url;
  public HashMap<String, String> prefs;
  public HashMap<String, String> labelNames;
}
