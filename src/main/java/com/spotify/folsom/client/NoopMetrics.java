/*
 * Copyright (c) 2014-2015 Spotify AB
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

package com.spotify.folsom.client;

import com.google.common.util.concurrent.ListenableFuture;
import com.spotify.folsom.GetResult;
import com.spotify.folsom.MemcacheStatus;
import com.spotify.folsom.Metrics;

import java.util.List;

public class NoopMetrics implements Metrics {
  public static final NoopMetrics INSTANCE = new NoopMetrics();

  @Override
  public void measureGetFuture(ListenableFuture<GetResult<byte[]>> future) {

  }

  @Override
  public void measureMultigetFuture(ListenableFuture<List<GetResult<byte[]>>> future) {

  }

  @Override
  public void measureDeleteFuture(ListenableFuture<MemcacheStatus> future) {

  }

  @Override
  public void measureSetFuture(ListenableFuture<MemcacheStatus> future) {

  }

  @Override
  public void measureIncrDecrFuture(ListenableFuture<Long> future) {

  }

  @Override
  public void measureTouchFuture(ListenableFuture<MemcacheStatus> future) {

  }

  @Override
  public void registerOutstandingRequestsGauge(OutstandingRequestsGauge gauge) {

  }
}
