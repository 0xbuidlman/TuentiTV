/*
 * Copyright (C) 2014 Pedro Vicente Gómez Sánchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.pedrovgs.tuentitv.model;

import com.github.pedrovgs.tuentitv.ui.data.CardInfo;

/**
 * Class created to represent a user contact. One contact has a name and one avatar.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
public class Contact implements CardInfo {

  private final String name;
  private final String avatarUrl;
  private final String secondaryImage;

  public Contact(String name, String avatarUrl, String secondaryImage) {
    this.name = name;
    this.avatarUrl = avatarUrl;
    this.secondaryImage = secondaryImage;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public String getName() {
    return name;
  }

  @Override public String getId() {
    return name;
  }

  @Override public String getCardImageUrl() {
    return getAvatarUrl();
  }

  @Override public String getTitle() {
    return getName();
  }

  @Override public String getText() {
    return null;
  }

  @Override public String getSecondaryImage() {
    return secondaryImage;
  }
}
