package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        // given
        User fabian = new Millenials("fabian");
        User mateusz = new ZGeneration("mikołaj");
        User tomek = new YGeneration("tomek");

        // when
        String fabianSocialMedia = fabian.sharePost();
        String mateuszSocialMedia = mateusz.sharePost();
        String tomekSocialMedia = tomek.sharePost();

        // then
        assertEquals("Facebook",fabianSocialMedia);
        assertEquals("Snapchat",mateuszSocialMedia);
        assertEquals("Twitter",tomekSocialMedia);
    }

    @Test
    void testIndividualSharingStrategy(){

        // given
        User olek = new Millenials("olek");

        // when
        olek.setSocialNetwork(new SnapchatPublisher());
        String olekSocialMedia = olek.sharePost();


        // then
        assertEquals("Snapchat", olekSocialMedia);

    }

}
