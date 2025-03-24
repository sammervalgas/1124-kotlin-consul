#!/bin/bash

# Função para verificar se o Consul está disponível
wait_for_consul() {
  echo "Aguardando o Consul iniciar..."
  until curl -s http://127.0.0.1:8500/v1/status/leader > /dev/null; do
    echo "Consul ainda não está pronto. Tentando novamente em 2 segundos..."
    sleep 2
  done
  echo "Consul está pronto!"
}

# Aguarda o Consul ficar disponível
wait_for_consul

# Adiciona as chaves e valores ao Consul
echo "Adicionando Key-Values ao Consul..."
consul kv put config/consuldemo/auth.client-id "myclientid"
consul kv put config/consuldemo/auth.client-secret "1234567890"
consul kv put config/consuldemo/app.features.cfg  @/usr/local/bin/features.json
echo "Key-Values adicionados com sucesso!"

# Mantém o contêiner ativo
tail -f /dev/null
