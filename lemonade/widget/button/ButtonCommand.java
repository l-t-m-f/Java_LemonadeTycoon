package lemonade.widget.button;

import lemonade.Util;
import lemonade.enumeration.HireType;
import lemonade.enumeration.LocationType;
import lemonade.enumeration.UpgradeType;
import lemonade.singleton.GameManager;
import lemonade.widget.counter.FloatCounter;
import lemonade.widget.counter.IntCounter;
import lemonade.widget.view.inner.HireProfile;
import lemonade.widget.view.inner.Locations;
import lemonade.widget.view.inner.ShopUpgrade;
import lemonade.widget.view.panel.Results;

public class ButtonCommand {

  public static class DoNothing implements Runnable {
    public void run() {
      System.out.println("Button command not implemented!");
    }
  }

  public static class Play implements Runnable {
    public void run() {
      GameManager.getInstance().setKeystrokesResponsiveness(false);
      GameManager.getInstance().setPresentedViewIndex(1);
    }
  }

  public static class StartDay implements Runnable {
    public void run() {
      GameManager.getInstance().setKeystrokesResponsiveness(false);
      GameManager.getInstance().setPresentedViewIndex(2);
    }
  }

  public static class BackToMenu implements Runnable {
    public void run() {
      GameManager.getInstance().setKeystrokesResponsiveness(false);
      GameManager.getInstance().setPresentedViewIndex(0);
    }
  }

  public static class ShowResult implements Runnable {
    public void run() {
      GameManager.getInstance().getPresentedMainView().hideAllSubviews();
      GameManager.getInstance().getPresentedMainView().showSubview(0);
    }
  }

  public static class ShowRent implements Runnable {
    public void run() {
      GameManager.getInstance().getPresentedMainView().hideAllSubviews();
      GameManager.getInstance().getPresentedMainView().showSubview(1);
    }
  }

  public static class ShowUpgrades implements Runnable {
    public void run() {
      GameManager.getInstance().getPresentedMainView().hideAllSubviews();
      GameManager.getInstance().getPresentedMainView().showSubview(2);
    }
  }

  public static class ShowStaff implements Runnable {
    public void run() {
      GameManager.getInstance().getPresentedMainView().hideAllSubviews();
      GameManager.getInstance().getPresentedMainView().showSubview(3);
    }
  }

  public static class ShowMarketing implements Runnable {
    public void run() {
      GameManager.getInstance().getPresentedMainView().hideAllSubviews();
      GameManager.getInstance().getPresentedMainView().showSubview(4);
    }
  }

  public static class ShowRecipe implements Runnable {
    public void run() {
      GameManager.getInstance().getPresentedMainView().hideAllSubviews();
      GameManager.getInstance().getPresentedMainView().showSubview(5);
    }
  }

  public static class ShowSupplies implements Runnable {
    public void run() {
      GameManager.getInstance().getPresentedMainView().hideAllSubviews();
      GameManager.getInstance().getPresentedMainView().showSubview(6);
    }
  }

  public static class ShowYesterdays implements Runnable {
    public void run() {
      GameManager.getInstance().getPresentedMainView().getSubview(0).hideAllSubviews();
      GameManager.getInstance().getPresentedMainView().getSubview(0).showSubview(0);
      Results.setPresentedInnerViewName("Yesterday's Result");
    }
  }

  public static class ShowCharts implements Runnable {
    public void run() {
      GameManager.getInstance().getPresentedMainView().getSubview(0).hideAllSubviews();
      GameManager.getInstance().getPresentedMainView().getSubview(0).showSubview(1);
      Results.setPresentedInnerViewName("Charts");
    }
  }

  public static class ShowProfitLoss implements Runnable {
    public void run() {
      GameManager.getInstance().getPresentedMainView().getSubview(0).hideAllSubviews();
      GameManager.getInstance().getPresentedMainView().getSubview(0).showSubview(2);
      Results.setPresentedInnerViewName("Profit & Loss");
    }
  }

  public static class ShowBalanceSheet implements Runnable {
    public void run() {
      GameManager.getInstance().getPresentedMainView().getSubview(0).hideAllSubviews();
      GameManager.getInstance().getPresentedMainView().getSubview(0).showSubview(3);
      Results.setPresentedInnerViewName("Balance Sheet");
    }
  }

  public static class ShowShopLemons implements Runnable {
    public void run() {
      GameManager.getInstance().getPresentedMainView().getSubview(6).hideAllSubviews();
      GameManager.getInstance().getPresentedMainView().getSubview(6).showSubview(0);
    }
  }

  public static class ShowShopSugar implements Runnable {
    public void run() {
      GameManager.getInstance().getPresentedMainView().getSubview(6).hideAllSubviews();
      GameManager.getInstance().getPresentedMainView().getSubview(6).showSubview(1);
    }
  }

  public static class ShowShopIce implements Runnable {
    public void run() {
      GameManager.getInstance().getPresentedMainView().getSubview(6).hideAllSubviews();
      GameManager.getInstance().getPresentedMainView().getSubview(6).showSubview(2);
    }
  }

  public static class ShowShopCups implements Runnable {
    public void run() {
      GameManager.getInstance().getPresentedMainView().getSubview(6).hideAllSubviews();
      GameManager.getInstance().getPresentedMainView().getSubview(6).showSubview(3);
    }
  }
  
  // Rent commands
  
  public static class PreviousLocation implements Runnable {
    public void run() {
      if(Locations.getPresentedLocationIndex() > 0) {
        Locations.setPresentedLocationIndex(Locations.getPresentedLocationIndex() - 1);
      }
    }
  }

  public static class NextLocation implements Runnable {
    public void run() {
      if(Locations.getPresentedLocationIndex() < (LocationType.MAX_LOCATION_TYPE.ordinal() - 1)) {
        Locations.setPresentedLocationIndex(Locations.getPresentedLocationIndex() + 1);
      }
    }
  }

  public static class RentLocation implements Runnable {
    public void run() {
      
    }
  }

  // Upgrades commands

  public static class PreviousUpgrade implements Runnable {
    public void run() {
      if(ShopUpgrade.getPresentedUpgradeIndex() > 0) {
        ShopUpgrade.setPresentedUpgradeIndex(ShopUpgrade.getPresentedUpgradeIndex() - 1);
      }
    }
  }

  public static class NextUpgrade implements Runnable {
    public void run() {
      if(ShopUpgrade.getPresentedUpgradeIndex() < (UpgradeType.MAX_UPGRADE_TYPE.ordinal() - 1)) {
        ShopUpgrade.setPresentedUpgradeIndex(ShopUpgrade.getPresentedUpgradeIndex() + 1);
      }
    }
  }

  public static class BuyUpgrade implements Runnable {
    public void run() {
      
    }
  }

  // Staff commands

  public static class PreviousHire implements Runnable {
    public void run() {
      if(HireProfile.getPresentedHireIndex() > 0) {
        HireProfile.setPresentedHireIndex(HireProfile.getPresentedHireIndex() - 1);
      }
    }
  }

  public static class NextHire implements Runnable {
    public void run() {
      if(HireProfile.getPresentedHireIndex() < (HireType.MAX_HIRE_TYPE.ordinal() - 1)) {
        HireProfile.setPresentedHireIndex(HireProfile.getPresentedHireIndex() + 1);
      }
    }
  }

  public static class Hire implements Runnable {
    public void run() {
      
    }
  }


  // Marketing commands



  // Recipe commands

  public static class AddLemonToRecipe implements Runnable {
    public void run() {
      GameManager.getInstance().getRecipe().getLemons().increment();
      System.out.println(GameManager.getInstance().getRecipe().getLemons().getCount());
    }
  }

  public static class RemoveLemonFromRecipe implements Runnable {
    public void run() {
      GameManager.getInstance().getRecipe().getLemons().decrement();
      System.out.println(GameManager.getInstance().getRecipe().getLemons().getCount());
    }
  }

  public static class AddSugarToRecipe implements Runnable {
    public void run() {
      GameManager.getInstance().getRecipe().getSugar().increment();
      System.out.println(GameManager.getInstance().getRecipe().getSugar().getCount());
    }
  }

  public static class RemoveSugarFromRecipe implements Runnable {
    public void run() {
      GameManager.getInstance().getRecipe().getSugar().decrement();
      System.out.println(GameManager.getInstance().getRecipe().getSugar().getCount());
    }
  }

  public static class AddIceToRecipe implements Runnable {
    public void run() {
      GameManager.getInstance().getRecipe().getIce().increment();
      System.out.println(GameManager.getInstance().getRecipe().getIce().getCount());
    }
  }

  public static class RemoveIceFromRecipe implements Runnable {
    public void run() {
      GameManager.getInstance().getRecipe().getIce().decrement();
      System.out.println(GameManager.getInstance().getRecipe().getIce().getCount());
    }
  }

  public static class AddLemonsToOrder12 implements Runnable {
    public void run() {
      FloatCounter currentTotal = GameManager.getInstance().getOrder().getTotal();
      if (GameManager.getInstance().getWallet().hasEnoughFor(currentTotal.getCount() + Util.Values.LEMONS_COST_12)) {
        GameManager.getInstance().getOrder().getLemonCounters()[0].add(12);
        currentTotal.add(Util.Values.LEMONS_COST_12);
      }
    }
  }

  public static class AddLemonsToOrder24 implements Runnable {
    public void run() {
      FloatCounter currentTotal = GameManager.getInstance().getOrder().getTotal();
      if (GameManager.getInstance().getWallet().hasEnoughFor(currentTotal.getCount() + Util.Values.LEMONS_COST_24)) {
        GameManager.getInstance().getOrder().getLemonCounters()[1].add(24);
        currentTotal.add(Util.Values.LEMONS_COST_24);
      }
    }
  }

  public static class AddLemonsToOrder48 implements Runnable {
    public void run() {
      FloatCounter currentTotal = GameManager.getInstance().getOrder().getTotal();
      if (GameManager.getInstance().getWallet().hasEnoughFor(currentTotal.getCount() + Util.Values.LEMONS_COST_48)) {
        GameManager.getInstance().getOrder().getLemonCounters()[2].add(48);
        currentTotal.add(Util.Values.LEMONS_COST_48);
      }
    }
  }

  public static class SubtractLemonsFromOrder12 implements Runnable {
    public void run() {
      if (GameManager.getInstance().getOrder().getLemonCounters()[0].getCount() >= 12) {
        GameManager.getInstance().getOrder().getLemonCounters()[0].subtract(12);
        GameManager.getInstance().getOrder().getTotal().subtract(Util.Values.LEMONS_COST_12);
      }
    }
  }

  public static class SubtractLemonsFromOrder24 implements Runnable {
    public void run() {
      if (GameManager.getInstance().getOrder().getLemonCounters()[1].getCount() >= 24) {
        GameManager.getInstance().getOrder().getLemonCounters()[1].subtract(24);
        GameManager.getInstance().getOrder().getTotal().subtract(Util.Values.LEMONS_COST_24);
      }
    }
  }

  public static class SubtractLemonsFromOrder48 implements Runnable {
    public void run() {
      if (GameManager.getInstance().getOrder().getLemonCounters()[2].getCount() >= 48) {
        GameManager.getInstance().getOrder().getLemonCounters()[2].subtract(48);
        GameManager.getInstance().getOrder().getTotal().subtract(Util.Values.LEMONS_COST_48);
      }
    }
  }

  public static class BuyLemonOrder implements Runnable {
    public void run() {
      float currentTotal = GameManager.getInstance().getOrder().getTotal().getCount();
    
      if (GameManager.getInstance().getWallet().hasEnoughFor(currentTotal)) {
        GameManager.getInstance().getWallet().getCash().subtract(currentTotal);
        GameManager.getInstance().getSupplies().getLemons().add(GameManager.getInstance().getOrder().getLemonsTotal());
        for(IntCounter c : GameManager.getInstance().getOrder().getLemonCounters()) {
          c.reset();
        }
      }
    }
  }

}
