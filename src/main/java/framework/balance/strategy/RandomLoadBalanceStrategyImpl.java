package framework.balance.strategy;

import framework.zookeeper.registermessage.ProviderRegisterMessage;

import java.util.List;

public class RandomLoadBalanceStrategyImpl implements LoadBalanceStrategy {

    @Override
    public ProviderRegisterMessage select(List<ProviderRegisterMessage> messages) {
        return null;
    }
}