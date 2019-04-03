/*
 * Copyright 2014-2017 Spotify AB
 * Copyright 2016-2019 The Last Pickle Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.cassandrareaper.storage.cassandra;


import com.datastax.driver.core.Session;

public final class Migration008 {

  private Migration008() {
  }

  /**
   * fix segment start and end times in the repair_run table.
   *  delegates to FixRepairSegmentTimestamps as that does everything already.
   */
  public static void migrate(Session session) {
    FixRepairSegmentTimestamps.migrate(session);
  }
}