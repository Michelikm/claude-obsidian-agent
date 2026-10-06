# Claude + Obsidian Agent

Este repositório nasce para criar um agente inteligente que:
- guarda informações já processadas por Claude;
- consulta essa memória antes de reprocessar;
- toma decisões para editar, criar e relacionar notas no Obsidian;
- evolui em direção a automações e aprendizado contínuo.

## Objetivo principal

Construir um sistema composto por:
- um bot/agent em Java;
- memória persistente para contexto e histórico;
- integração com Claude da Anthropic;
- camada de ações sobre o vault do Obsidian;
- mecanismos de revisão e aprendizado progressivo.

## Arquitetura proposta

1. Bot/Agent (Java)
   - API REST
   - orquestra ações
   - consulta memória
   - invoca Claude
   - executa ações no vault

2. Memória persistente
   - SQLite / JSON local / storage estruturado
   - guarda notas, resumos, decisões, conexões e revisões
   - permite reutilização de contexto

3. Claude
   - analisa notas e contexto
   - decide criar, editar, revisar ou conectar notas
   - produz resumos, gaps e sugestões

4. Obsidian
   - fonte de conhecimento
   - interface para leitura/escrita do vault
   - painel de ações e histórico

## Primeira fase (MVP)

- criar API Java com endpoints básicos de memória
- definir schema inicial de memória
- integrar Claude com API
- expor endpoints para salvar e consultar contexto
- preparar a base para ações no vault

## Próxima fase

- plugin Obsidian para orquestrar ações
- leitura e escrita automática do vault
- decisões autorizadas e logadas
- revisão por topic e spaced repetition

## Estrutura do repositório

- `backend-agent/` : aplicação Java / API/agent
- `obsidian-plugin/` : plugin Obsidian
- `docs/` : documentação técnica e roadmap
- `scripts/` : utilitários e setup

## Status

- Repositório criado
- Estrutura inicial em andamento
- Próximo passo: base do agente Java + memória

## Próximo passo sugerido

Implementar a primeira versão da camada de agente e memória.
