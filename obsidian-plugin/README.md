# Arquitetura do projeto

## Camadas

### 1. Camada de ação
- responsável por executar alterações no Obsidian
- leitura/escrita de arquivos markdown
- criação de notas, links e tags

### 2. Camada de memória
- guarda conteúdo processado
- lista de notas e resumos
- histórico de ações
- contexto reutilizável

### 3. Camada de decisão
- chama Claude com perguntas e contexto
- decide se é necessário criar, editar ou conectar notas
- valida se ação é segura/útil

### 4. Camada de interface
- plugin Obsidian
- painel do agente
- comandos manuais e automáticos

## Fluxo de execução

1. Obsidian dispara evento ou comando.
2. Bot lê contexto relevante.
3. Bot consulta memória.
4. Claude analisa contexto e decide.
5. Agente salva a decisão e o resultado.
6. Se necessário, executa alteração no vault.
7. Histórico é atualizado.

## Objetivo da fase 1

- API Java funcional
- memória local inicial
- base para integração com Claude
- contrato pronto para plugin Obsidian

## Objetivo da fase 2

- plugin Obsidian
- leitura/escrita real do vault
- validação antes de alterar arquivos

## Objetivo da fase 3

- aprendizado automáticopor revisões e spaced repetition
- criação de notas e ligações por contexto
- execução autônoma com logs
