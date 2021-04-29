package com.test.test.jgit;


import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "gitServer", urlPatterns = {"/*"},
        loadOnStartup = 1,
        initParams = {
                @WebInitParam(name = "base-path", value = "D:\\tmp\\gityou\\repository"),
                @WebInitParam(name = "export-all", value = "true")
        })
public class GitServlet extends org.eclipse.jgit.http.server.GitServlet {
}
