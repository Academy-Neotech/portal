package srl.neotech.filters;

import org.apache.logging.log4j.core.util.UuidUtil;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Component
public class HTTResponseHeader implements Filter {

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain) throws IOException, ServletException
    {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        res.addHeader("Access-Control-Allow-Origin", "*");
        res.addHeader("request-id",  UuidUtil.getTimeBasedUuid().toString());
        chain.doFilter(req, res);
    }
}
