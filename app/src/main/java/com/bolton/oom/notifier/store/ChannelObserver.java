/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bolton.oom.notifier.store;

import com.bolton.oom.notifier.dto.PostContentDTO;

/**
 *
 * @author Kevin Boy
 */
public interface ChannelObserver {
    public void notifyPostCreation(PostContentDTO postContentDTO);
}
