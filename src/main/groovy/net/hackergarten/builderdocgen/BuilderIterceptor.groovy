package net.hackergarten.builderdocgen

class BuilderIterceptor implements Interceptor {
    @Override
    Object beforeInvoke(Object builder, String methodName, Object[] arguments) {
        println "$builder -> $methodName($arguments)"
        return null
    }

    @Override
    Object afterInvoke(Object builder, String methodName, Object[] arguments, Object result) {
        return null
    }

    @Override
    boolean doInvoke() {
        return true
    }
}
