

package mage.abilities.common;

import mage.MageObject;
import mage.abilities.ActivatedAbilityImpl;
import mage.abilities.costs.common.PayLifeCost;
import mage.abilities.costs.common.SacrificeSourceCost;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.common.search.SearchLibraryPutInPlayEffect;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.filter.FilterCard;
import mage.filter.predicate.Predicate;
import mage.filter.predicate.Predicates;
import mage.target.common.TargetCardInLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author BetaSteward_at_googlemail.com
 */
public class FetchLandActivatedAbility extends ActivatedAbilityImpl {

    public FetchLandActivatedAbility(Set<SubType> subtypes) {
        this(true, subtypes);
    }

    public FetchLandActivatedAbility(boolean withDamage, Set<SubType> subtypes) {
        super(Zone.BATTLEFIELD, null);
        addCost(new TapSourceCost());
        if (withDamage) {
            addCost(new PayLifeCost(1));
        }
        addCost(new SacrificeSourceCost());
        FilterCard filter = new FilterCard(subTypeNames(subtypes));
        filter.add(CardType.LAND.getPredicate());
        List<Predicate<MageObject>> subtypePredicates = new ArrayList<>();
        for (SubType subtype : subtypes) {
            subtypePredicates.add(subtype.getPredicate());
        }
        filter.add(Predicates.or(subtypePredicates));
        TargetCardInLibrary target = new TargetCardInLibrary(filter);
        addEffect(new SearchLibraryPutInPlayEffect(target, false, true, Outcome.PutLandInPlay));
    }

    private FetchLandActivatedAbility(FetchLandActivatedAbility ability) {
        super(ability);
    }

    private String subTypeNames(Set<SubType> subTypes) {
        return subTypes.stream().map(SubType::getDescription).collect(Collectors.joining(" or ")) + " card";
    }

    @Override
    public FetchLandActivatedAbility copy() {
        return new FetchLandActivatedAbility(this);
    }
}
