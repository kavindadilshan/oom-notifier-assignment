/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bolton.oom.notifier.store;

/**
 *
 * @author Kevin Boy
 */
public interface ChannelSubject {
     public void addObserver(ChannelObserver channelObserver);
     public void removeObserver(ChannelObserver channelObserver);
}
