# Obsidian Claude Agent

### Repositório base para desenvolvimento do agente autônomo.

Este diretório será usado para a aplicação Java responsável por:
- receber contexto e tarefas;
- consultar memória;
- chamar Claude;
- decidir se necessita criar, editar ou conectar notas;
- administrar histórico e ações.

## Stack planejada

- Java 21
- Spring Boot 3
- Maven
- SQLite (ou similar para memória local)
- Anthropic Claude API

## Endpoints iniciais

- `GET /api/health`
- `POST /api/memory/remember`
- `POST /api/memory/search`
- `POST /api/agent/run`

## Estrutura esperada

- `src/main/java/...` com controllers, services e models
- `src/main/resources/application.properties`
- `src/main/resources/sql/schema.sql` (quando implementado)

## Objetivo da fase 1

Executar a lógica principal:

1. receber contexto ou conteúdo da nota;
2. verificar o cache/memória;
3. decidir se deve usar Claude;
4. persistir o que foi processado;
5. devolver resposta útil para o agente ou plugin.
