package br.com.alura.ScreenMatch.Service;

public interface IConverteDados {
    <T> T obterDados (String json, Class <T> classe);
}
