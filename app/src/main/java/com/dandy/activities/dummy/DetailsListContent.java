package com.dandy.activities.dummy;

import android.app.Fragment;

import com.dandy.activities.fragments.CharacterDetailDetailFragment;
import com.dandy.activities.fragments.CharacterDetailInfoFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DetailsListContent {

    public static List<DetailsListItem> ITEMS = new ArrayList<DetailsListItem>();
    public static Map<String, DetailsListItem> ITEM_MAP = new HashMap<String, DetailsListItem>();

    static {
        // Add 3 sample items.
        addItem(new DetailsListItem("Details", new CharacterDetailDetailFragment()));
        addItem(new DetailsListItem("Abilities", new CharacterDetailInfoFragment()));
//        addItem(new DetailsListItem("Attacks", "Attacks"));
//        addItem(new DetailsListItem("Health", "Health"));
//        addItem(new DetailsListItem("Powers", "Powers"));
//        addItem(new DetailsListItem("Skills", "Skills"));
//        addItem(new DetailsListItem("Feats", "Feats"));
//        addItem(new DetailsListItem("Items", "Items"));
//        addItem(new DetailsListItem("Rituals", "Rituals"));
//        addItem(new DetailsListItem("Notes", "Notes"));
    }

    private static void addItem(DetailsListItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DetailsListItem {
        public final String id;
        public final Fragment fragment;

        public DetailsListItem(final String id, final Fragment fragment) {
            this.id = id;
            this.fragment = fragment;
        }

        @Override
        public String toString() {
            return id;
        }
    }
}
